package ghost;

import util.Print;

public class LevelScene extends Scene{

    public LevelScene(){
        Print.print("Loading Default Level...");
        Print.print("Default Level loaded.");
        Window.get().r = 1;
        Window.get().g = 1;
        Window.get().b = 1;
    }

    @Override
    public void update(float dt) {

    }
}
