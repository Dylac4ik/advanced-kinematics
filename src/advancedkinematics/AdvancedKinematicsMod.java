package advancedkinematics;
import mindustry.mod.*;

public class AdvancedKinematicsMod extends Mod{
    public AdvancedKinematicsMod(){
        
    }

    @Override
    public void loadContent(){
        AdvancedKinematicsItems.load();
        AdvancedKinematicsBlocks.load();
        
    }

}