public enum CatalogNames {

    //COMPUTERS_AND_NETWORKS(1),
    ELECTRONICS(2),
    //HOME_APPLIANCES(3),
   // WORK_AND_OFFICE(4),
   // CONSTRUCTION_AND_REPAIR(5),
  //  CARS_AND_MOTORCYCLES(6),
   HOUSE_AND_GARDEN(7),
   BEAUTY_AND_SPORTS(8);
 //   FOR_CHILDREN_AND_MOTHERS(9),
  //  SALE(10);

    private final int index;

    CatalogNames(int index) {
        this.index = index;
    }
    public int getIndex(){
        return index;
    }
}
