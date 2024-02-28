package polymorphism.interface0.ex5;

public class Starcraft {
    public static void main(String[] args) {
         Attackable[] attackUnits = {new Marine(), new SiegeTank()};
        Movable[] moveUnits = {new Marine(), new Observer()};

        for (Attackable unit : attackUnits) {
            unit.attack();
        }
        for (Movable unit : moveUnits) {
            unit.move();
        }

        SupplyDepot depot = new SupplyDepot();
        depot.provideSupply();
    }
}
