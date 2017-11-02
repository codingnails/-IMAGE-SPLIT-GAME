import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.awt.*;
import javax.swing.*;

class TestImageSplit1 extends SplitGame{
	
	
static String inputFile;
static String filename;

static int uploadimage() {
try {	
JFileChooser fc = new JFileChooser();
fc.setFileSelectionMode(JFileChooser.FILES_ONLY);

if (fc.showOpenDialog(null)==JFileChooser.APPROVE_OPTION) {
inputFile=fc.getSelectedFile().getPath();
filename=fc.getSelectedFile().getName();
}

File file = new File(inputFile); // path of selecetd image
FileInputStream fis = new FileInputStream(file);
BufferedImage image = ImageIO.read(fis); //reading the image file

int rows = 2; //You should decide the values for rows and cols variables
int cols = 2;
int chunks = rows * cols;

int chunkWidth = image.getWidth() / cols; // determines the chunk width and height
int chunkHeight = image.getHeight() / rows;
int count = 0;
BufferedImage imgs[] = new BufferedImage[chunks]; //Image array to hold image chunks
for (int x = 0; x < rows; x++) {
for (int y = 0; y < cols; y++) {
//Initialize the image array with image chunks
imgs[count] = new BufferedImage(chunkWidth, chunkHeight, image.getType());

// draws the image chunk
Graphics2D gr = imgs[count++].createGraphics();
gr.drawImage(image, 0, 0, chunkWidth, chunkHeight, chunkWidth * y, chunkHeight * x, chunkWidth * y + chunkWidth, chunkHeight * x + chunkHeight, null);
gr.dispose();
}
}

for (int i = 0; i < imgs.length; i++) {
ImageIO.write(imgs[i], "jpg", new File("C:\\Users\\rupaligupta\\Desktop\\New folder (4)\\"+"img" + i + ".jpg"));
}

splitgame("C:\\Users\\rupaligupta\\Desktop\\New folder (4)\\");
return 1;
}
catch(Exception e) {}
return 0;
}

}
