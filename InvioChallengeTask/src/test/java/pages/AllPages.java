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
}
