<<<<<<< HEAD
package ghost;

import org.lwjgl.Version;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.opengl.GL;
import util.Print;

import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryUtil.NULL;

public class Window {
    private int width, height;
    private String title;
    private long glfwWindow;

    private static Window window = null;

    private Window(){
        this.width = 800;
        this.height = 600;
        this.title = "gh//OST Engine";
    }

    public static Window get(){
        if (Window.window == null){
            Window.window = new Window();
        }
        return Window.window;
    }

    public void run(){
        System.out.println("\n\ngh//OST Engine Runtime //");
        Print.print("Currently using LWJGl " + Version.getVersion() + ".");
        init();
        loop();

        // Free the memory
        glfwFreeCallbacks(glfwWindow);
        glfwDestroyWindow(glfwWindow);

        // Terminate GLFW and free all the error callbacks
        glfwTerminate();
        glfwSetErrorCallback(null).free();

    }

    public void init() {
        // Setup Error Callback
        GLFWErrorCallback.createPrint(System.err).set();
        // Initialize GLFW
        if (!glfwInit()) {
            throw new IllegalStateException("Unable to initialize GLFW.");
        } else{
            Print.print("Successfully initialized GLFW.");
        }
        // Setup GLFW
        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);
        // If you want the window to start maximized use > glfwWindowHint(GLFW_MAXIMIZED, GLFW_TRUE));


        // Create the Window
        glfwWindow = glfwCreateWindow(this.width, this.height, this.title, NULL, NULL);
        if (glfwWindow == NULL) {
            throw new IllegalStateException("Unable to create the GLFW window.");
        }

        // Set all the input callbacks
        glfwSetCursorPosCallback(glfwWindow, MouseListener::mousePosCallback);
        glfwSetMouseButtonCallback(glfwWindow, MouseListener::mouseButtonCallback);
        glfwSetScrollCallback(glfwWindow, MouseListener::mouseScrollCallback);

        // Set current OpenGL context
        glfwMakeContextCurrent(glfwWindow);
        // Enable V-Sync
        glfwSwapInterval(1);
        // Render Window
        glfwShowWindow(glfwWindow);
        // Create all external content capabilities
        GL.createCapabilities();
    }

    public void loop(){
        while(!glfwWindowShouldClose(glfwWindow)){
            // Poll Events
            glfwPollEvents();
            // Render Background Color
            glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            glClear(GL_COLOR_BUFFER_BIT);
            glfwSwapBuffers(glfwWindow);
        }
    }
=======
package ghOST;public class Window {
>>>>>>> 0f28ef12b2e143e9e70818efd202807609b88491
}
