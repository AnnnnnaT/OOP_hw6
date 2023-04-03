import Model.Notebook;
import Presenter.Presenter;
import View.Menu;
import View.View;


public class main {
    public static void main(String[] args){
        Notebook notebook = new Notebook();
        View ui = new Menu();
        Presenter presenter = new Presenter(ui, notebook);
        presenter.start();

    }
}
