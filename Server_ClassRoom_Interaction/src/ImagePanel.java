import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class ImagePanel extends JPanel
{
    private BufferedImage image;

    public ImagePanel(String path,int imageWidth,int imageHeight) {
       try 
       {
          image = ImageIO.read(new File(path));
          image=scale(image,imageWidth,imageHeight);
       } catch (IOException ex) {
    	   System.out.println("hello lavish kothari");
            // handle exception...
       }
    }

	private BufferedImage scale(BufferedImage src, int w, int h) 
	{  
        int type = BufferedImage.TYPE_INT_RGB;  
        BufferedImage dst = new BufferedImage(w, h, type);  
        Graphics2D g2 = dst.createGraphics();  
        // Fill background for scale to fit.  
        g2.setBackground(UIManager.getColor("Panel.background"));  
        g2.clearRect(0,0,w,h);  
        double xScale = (double)w/src.getWidth();  
        double yScale = (double)h/src.getHeight();  
        // Scaling options:  
        // Scale to fit - image just fits in label.  
        //double scale = Math.min(xScale, yScale);  
        // Scale to fill - image just fills label.  
        double scale = Math.max(xScale, yScale);  
        int width  = (int)(scale*src.getWidth());  
        int height = (int)(scale*src.getHeight());  
        int x = (w - width)/2;  
        int y = (h - height)/2;  
        g2.drawImage(src, x, y, width, height, null);  
        g2.dispose();  
        return dst;  
    }  
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null);
    }
}