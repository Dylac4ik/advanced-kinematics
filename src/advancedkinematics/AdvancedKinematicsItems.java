package advancedkinematics;

import arc.graphics.Color;
import mindustry.content.Planets;
import mindustry.type.Item;

public class AdvancedKinematicsItems{
    public static Item copperPlate;

    public static void load(){
        copperPlate = new Item("copper-plate", Color.valueOf("#c06b10")){{
            cost = 1f;
            shownPlanets.add(Planets.serpulo);
        }};
    }
}