//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        float wagaMarczynski=67;
        float wagaMarsMarczynski=wagaMarczynski*(float)0.38;
        double wagaDoubleMarczynski=wagaMarsMarczynski;
        int wagaIntMarczynski=(int)wagaDoubleMarczynski;
        char wagaCharMarczynski=(char)wagaIntMarczynski;
        int wagaAfterCalculationsMarczynski=wagaCharMarczynski+10;
        System.out.println("Normal weight: "+wagaMarczynski);
        System.out.println("Weight on mars: "+wagaMarsMarczynski);
        System.out.print("Weight with precision to 2 digits: ");
        System.out.printf("%.2f",wagaDoubleMarczynski);
        System.out.println();
        System.out.println("Weight (int): "+wagaIntMarczynski);
        System.out.println("Weight (char): "+wagaCharMarczynski);
        System.out.println("Weight after adding 10: "+wagaAfterCalculationsMarczynski);
    }
}