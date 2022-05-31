package components;

import ghost.Component;
import util.Print;

public class FontRenderer extends Component {

    @Override
    public void start() {
        if(gameObject.getComponent(SpriteRenderer.class) != null){
            Print.print("Font Renderer found.");
        }
    }

    @Override
    public void update(float dt) {

    }
}
