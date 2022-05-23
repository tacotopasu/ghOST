
package ghost;

import static org.lwjgl.glfw.GLFW.GLFW_PRESS;

public class KeyListener {
    private static KeyListener instance;
    private boolean keyPressed[] = new boolean[350];

    private KeyListener() {

    }

    public static KeyListener get(){
        if(KeyListener.instance == null){
            KeyListener.instance = new KeyListener();
        }
        return instance;
    }

    public static void keyCallback(long window, int key, int scancode, int action, int mods){
        if(action == GLFW_PRESS){
            get().keyPressed[key] = true;
        }
    }
}
