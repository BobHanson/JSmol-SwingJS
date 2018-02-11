package org.jmol.awtjs.swing;

import org.jmol.awtjs.Component;
import org.jmol.awtjs.SC;

public class ButtonGroup {
  
  private String id;
  
  public ButtonGroup() {
    id = Component.newID("bg");
  }
  
  public void add(SC item) {
    ((AbstractButton) item).htmlName = this.id;
  }

}