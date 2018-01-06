package edu.columbia.rdf.matcalc.bio.app;

import java.awt.FontFormatException;
import java.io.IOException;
import java.nio.file.Path;
import java.text.ParseException;

import javax.swing.UnsupportedLookAndFeelException;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.jebtk.core.AppService;
import org.jebtk.math.matrix.DataFrame;
import org.jebtk.modern.ColorTheme;
import org.jebtk.modern.help.GuiAppInfo;
import org.jebtk.modern.theme.ThemeService;
import org.xml.sax.SAXException;

import edu.columbia.rdf.matcalc.MainMatCalc;
import edu.columbia.rdf.matcalc.MainMatCalcWindow;
import edu.columbia.rdf.matcalc.MatCalcInfo;

public class MainBioMatCalc {
  public static final void main(String[] args) throws ClassNotFoundException, InstantiationException,
      IllegalAccessException, FontFormatException, IOException, UnsupportedLookAndFeelException {

    AppService.getInstance().setAppInfo("matcalc");

    ThemeService.getInstance().setTheme(ColorTheme.GREEN);

    GuiAppInfo info = new MatCalcInfo();

    MainMatCalc.main(info, new BioAppModuleLoader());
  }

  public static void open(Path file, int rowAnnotations) throws ClassNotFoundException, InstantiationException,
      IllegalAccessException, FontFormatException, IOException, UnsupportedLookAndFeelException, InvalidFormatException,
      SAXException, ParserConfigurationException, ParseException {
    MainMatCalcWindow window = MainMatCalc.main(new MatCalcInfo(), new BioAppModuleLoader());

    window.openFile(file).rowAnnotations(rowAnnotations).open();
  }

  public static void autoOpen(Path file, int rowAnnotations) throws ClassNotFoundException, InstantiationException,
      IllegalAccessException, FontFormatException, IOException, UnsupportedLookAndFeelException, InvalidFormatException,
      SAXException, ParserConfigurationException, ParseException {
    MainMatCalcWindow window = MainMatCalc.main(new MatCalcInfo(), new BioAppModuleLoader());

    window.openFile(file).rowAnnotations(rowAnnotations).autoOpen();
  }

  public static void openMatrix(DataFrame matrix) throws ClassNotFoundException, InstantiationException,
      IllegalAccessException, FontFormatException, IOException, UnsupportedLookAndFeelException {
    MainMatCalcWindow window = MainMatCalc.main(new MatCalcInfo(), new BioAppModuleLoader());

    window.openMatrix(matrix);
  }
}
