import javax.swing.*;
class gui{
      public static void main(String args[]){
           JFrame frame = new JFrame("Hello There");
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setSize(1000,300);
          JButton button1 = new JButton("Button 1");
          JButton button2 = new JButton("Button 2");
          frame.getContentPane().add(button1);
          frame.getContentPane().add(button2);
          frame.setVisible(true);
     }
}