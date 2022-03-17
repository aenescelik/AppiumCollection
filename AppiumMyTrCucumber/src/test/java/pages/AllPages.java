package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import pages.android.*;
import pages.ios.AlertViewsPage;
import pages.ios.IOSSwitchPage;
import pages.ios.PickerViewPage;
import utilities.Driver;

import java.time.Duration;

public class AllPages {

//parametresiz costructor olustur.
    public AllPages(){
    }
    // her page class return type ile private instance olusturduk
    private APIDemosPage apiDemosPage;
    private SwitchPage switchPage;
    private PreferencePage preferencePage;
    private MainPage mainPage;
    private PreferenceDependenciesPage preferenceDependenciesPage;
    private DragDropPage dragDropPage;
    private ViewsPage viewsPage;
    private DateWidgetsPage dateWidgetsPage;
    private ExpandableListsPage expandableListsPage;
    private SpinnerPage spinnerPage;
    //======== burdan asagisi ios pageleri
    private AlertViewsPage alertViewsPage;
    private IOSSwitchPage iosSwitchPage;
    private PickerViewPage pickerViewPage;


// her page class icin public method olusturup obje olusturacagiz.
    public SpinnerPage spinnerPage(){
        if (spinnerPage == null) {
            spinnerPage=new SpinnerPage();
           }return spinnerPage;
    }

public APIDemosPage apiDemosPage(){
    if (apiDemosPage == null){
        apiDemosPage = new APIDemosPage();
    }
    return apiDemosPage;
}
    public MainPage mainPage(){
        if (mainPage == null){
            mainPage =  new MainPage();
        }
        return mainPage;
    }

    public PreferencePage preferencePage(){
        if (preferencePage== null){
            preferencePage = new PreferencePage();
        }
        return preferencePage;
    }

    public PreferenceDependenciesPage preferenceDependenciesPage(){
        if (preferenceDependenciesPage == null){
            preferenceDependenciesPage = new PreferenceDependenciesPage();
        }
        return preferenceDependenciesPage;
    }

    public SwitchPage switchPage(){
        if (switchPage == null){
            switchPage = new SwitchPage();
        }
        return switchPage;
    }

    public DragDropPage dragDropPage(){
    if (dragDropPage==null){
        dragDropPage=new DragDropPage();
    }
    return dragDropPage;
    }

    public ViewsPage viewsPage(){
        if (viewsPage == null) {
            viewsPage=new ViewsPage();
        }
        return viewsPage;
    }
    public DateWidgetsPage dateWidgetsPage(){
        if (dateWidgetsPage == null) {
            dateWidgetsPage=new DateWidgetsPage();
        }
        return dateWidgetsPage;
    }
    public ExpandableListsPage expandableListsPage(){
        if (expandableListsPage==null){
            expandableListsPage=new ExpandableListsPage();
        }
        return expandableListsPage;
    }

    public AlertViewsPage alertViewsPage(){
        if (alertViewsPage == null){
            alertViewsPage = new AlertViewsPage();
        }
        return alertViewsPage;
    }
    public IOSSwitchPage iosSwitchPage(){
        if (iosSwitchPage == null){
            iosSwitchPage = new IOSSwitchPage();
        }
        return iosSwitchPage;
    }
    public PickerViewPage pickerViewPage(){
        if (pickerViewPage == null ){
            pickerViewPage = new PickerViewPage();
        }
        return pickerViewPage;
    }

}
