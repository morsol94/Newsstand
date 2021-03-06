
import java.util.InputMismatchException;

/**
 * Makes up the user interface (text based) of the application. Responsible for
 * all user interaction, like displaying the menu and receiving input from the
 * user through the Input scanner.
 *
 * @author asty og Vegard Fjørtoft
 */
class AppInterface
{

    private Application application;
    //scanner for user input
    private InputScanner inputScanner;
    //use to keep track of where in the main menu we are
    private int menuSelection;
    //default position in menu
    private int defaultMenuPosition;

    /**
     * Creates an instance of the AppInterface User interface. An instance
     * of the AppInterface is created, and initialized.
     */
    public AppInterface()
    {
        //TODO: Replace "new DummyApplication" with your application class.
        this.application = new Application();
        this.inputScanner = new InputScanner();
        this.defaultMenuPosition = 0;
        this.menuSelection = 0;
        
    }

    /**
     * Starts the application by showing the menu and retrieving input from the
     * user.
     */
    void start()
    {
        //this.application.init();

        boolean quit = false;

        while (!quit)
        {
            try
            {

                switch (menuSelection)
                {
                    //default
                    case 0:
                        this.printMainMenu();
                        menuSelection = inputScanner.menuSelection(4);
                        break;
                      
                    //lists all products (currenttly only newspapers)
                    case 1:
                        //System.out.println("\nProducts: \n");
                        System.out.println(this.application.getContentOfRegister() + "\n");
                        menuSelection = this.defaultMenuPosition;
                        break;

                    //enters register submenu where you choose what to register
                    case 2:
                        this.printRegisterSubMenu();
                        int registerSubMenuSelection = inputScanner.menuSelection(4);
                        switch (registerSubMenuSelection)
                        {
                            case 1:
                                System.out.println("placeholder");
                                //this.application.doRegisterNewspaper();
                                break;
                                
                            case 2:
                                //TODO: add method for registering different product
                                System.out.println("placeholder");
                                break;

                            case 3:
                                //TODO: add method for registering different product
                                System.out.println("placeholder");
                                break;
                                
                            //goes back to default position ion main menu
                            case 4:
                                menuSelection = this.defaultMenuPosition;

                        }
                        break;

                    //find product by description, more search options will be added in own submenu
                    case 3:
                        System.out.println("\nPlease insert name of paper \n  ");
                        String title = inputScanner.getFirstWord();
                        System.out.println("\nPlease insert author of paper \n  ");
                        String publisher = inputScanner.getFirstWord();
                        String newspaperInfo = this.application.getSpecificNewspaper(title, publisher);
                        System.out.println(newspaperInfo + "\n");
                        menuSelection = this.defaultMenuPosition;
                        break;

                    //exit the application
                    case 4:
                        System.out.println("\nThank you for using Application v0.1. Bye!\n");
                        quit = true;
                        break;

                    default:
                }
            }
            catch (InputMismatchException ime)
            {
                System.out.println("\nERROR: Please provide a valid menu number..\n");
            }
            catch(EmptyStringException ese)
            {
                System.out.println("\nERROR: please provide valid input");
            }
        }

    }


    /**
     * Prints the main menu to system out.
     */
    private void printMainMenu()
    {
        System.out.println("\n**** Application v0.1 ****\n");
        System.out.println("1. List all products");
        System.out.println("2. Register new product");
        System.out.println("3. Find a product by title and publisher");
        System.out.println("4. Exit\n");
        System.out.println("Please choose menu item (1-4): \n");
        System.out.print(">  ");
    }
    
    private void printRegisterSubMenu()
    {
        System.out.println("What item do you want to register? \n");
        System.out.println("1. Register newspaper");
        System.out.println("2. Placeholder different item");
        System.out.println("3. Placeholder different item");
        System.out.println("4. Go back \n");
        System.out.println("Please choose menu item (1-4): \n");
        System.out.print(">  ");
    }
    
    private void printFindProductSubMenu()
    {
        //TODO: add print statements for menu
    }

}
