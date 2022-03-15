package pages;

import pages.android.*;

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

// her page class icin public method olusturup obje olusturacagiz.
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

}