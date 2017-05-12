package mx.com.iubix.ejercicio;


//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.app.ActionBar;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import mx.com.iubix.ejercicio.fragments.AmigosFragment;
import mx.com.iubix.ejercicio.fragments.Destacadosfragment;
import mx.com.iubix.ejercicio.fragments.ProfileFragment;


public class My_music extends Activity implements ActionBar.TabListener{

    private Fragment[] fragments = new Fragment[]{
            new Destacadosfragment(),
            new AmigosFragment(),
            new ProfileFragment()
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_music);

        setTabs();

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        for(android.app.Fragment fragment : fragments ){
            fragmentTransaction.add(R.id.main_my_music, fragment).hide(fragment);
        }

        fragmentTransaction.show(fragments[0]).commit();


    }

    private void setTabs(){

        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        actionBar.addTab(actionBar.newTab().setText("Destacados").setTabListener(this));
        actionBar.addTab(actionBar.newTab().setText("Amigos").setTabListener(this));
        actionBar.addTab(actionBar.newTab().setText("Perfil").setTabListener(this));


    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        for(Fragment fragment : fragments){
            fragmentTransaction.hide(fragment);
        }

        fragmentTransaction.show(fragments[tab.getPosition()]);

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }
}
