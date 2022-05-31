package components;

import ghost.Component;
import org.joml.Vector4f;

public class SpriteRenderer extends Component {

    private Vector4f color;

    public SpriteRenderer(Vector4f color) {
        this.color = color;
    }

    @Override
    public void start(){
        // Print.print("GameObject Started.");

    }

    @Override
    public void update(float dt){

    }

    public Vector4f getColor(){
        return this.color;
    }
}
