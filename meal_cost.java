class Main {
  public static void main(String[] args) {

    double basemealcost=20, mealcost;
    double tip_percent=5, tax_percent=5;

    mealcost=basemealcost+((tip_percent/100)*basemealcost);
    mealcost=mealcost+((tax_percent/100)*basemealcost);

    System.out.println("base meal cost is: " + basemealcost);
    System.out.println("tip percent is: " + tip_percent);
    System.out.println("tax percent is: " + tax_percent);
    System.out.println("meal cost is: " + mealcost);
        

  }
}
