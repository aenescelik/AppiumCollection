package pages;

public class AllPages {
    public AllPages(){
    }

    private MainPage mainPage;
    public MainPage getMainPage(){
        if(mainPage==null){
            mainPage=new MainPage();
        }return mainPage;
    }

    private SearchPage searchPage;
    public SearchPage getSearchPage() {
        if (searchPage == null) {
            searchPage=new SearchPage();
        } return searchPage;
    }
    private NavigationPage navigationPage;

    public NavigationPage getNavigationPage() {
        if (navigationPage == null) {
            navigationPage=new NavigationPage();
        } return navigationPage;
    }

    private NavigationSelectPage navigationSelectPage;

    public NavigationSelectPage getNavigationStartPage() {
        if (navigationSelectPage == null) {
            navigationSelectPage =new NavigationSelectPage();
        }
        return navigationSelectPage;
    }

    private WelcomePage welcomePage;

    public WelcomePage getWelcomePage() {
        if (welcomePage == null) {
            welcomePage =new WelcomePage();
        }
        return welcomePage;
    }

    private NavigationOnGoingPage navigationOnGoingPage;

    public NavigationOnGoingPage getNavigationOnGoingPage() {
        if (navigationOnGoingPage == null) {
            navigationOnGoingPage=new NavigationOnGoingPage();
        }
        return navigationOnGoingPage;
    }
}
