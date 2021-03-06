package edu.columbia.rdf.matcalc.bio.app;

import edu.columbia.rdf.matcalc.bio.BioModuleLoader;
import edu.columbia.rdf.matcalc.bio.FastaWriterModule;
import edu.columbia.rdf.matcalc.bio.toolbox.expression.ExpressionModule;
import edu.columbia.rdf.matcalc.bio.toolbox.fillgaps.FillGapsModule;
import edu.columbia.rdf.matcalc.bio.toolbox.probes.CollapseModule;
import edu.columbia.rdf.matcalc.bio.toolbox.probes.ProbeLocationsModule;
import edu.columbia.rdf.matcalc.toolbox.annotation.AnnotationModule;
import edu.columbia.rdf.matcalc.toolbox.conversion.ConversionModule;
import edu.columbia.rdf.matcalc.toolbox.dna.DnaModule;
import edu.columbia.rdf.matcalc.toolbox.genes.GeneAnnotationModule;
import edu.columbia.rdf.matcalc.toolbox.genes.info.GeneInfoModule;
import edu.columbia.rdf.matcalc.toolbox.ideogram.IdeogramModule;
import edu.columbia.rdf.matcalc.toolbox.motifs.MotifsModule;
import edu.columbia.rdf.matcalc.toolbox.newdendrogram.NewDendrogramModule;
import edu.columbia.rdf.matcalc.toolbox.pathway.PathwayModule;
import edu.columbia.rdf.matcalc.toolbox.patterndiscovery.PatternDiscoveryModule;
import edu.columbia.rdf.matcalc.toolbox.probes.ProbesModule;
import edu.columbia.rdf.matcalc.toolbox.regions.RegionsModule;

public class BioAppModuleLoader extends BioModuleLoader {
  public BioAppModuleLoader() {
    addModule(AnnotationModule.class);
    addModule(FillGapsModule.class);

    addModule(CollapseModule.class);

    addModule(ProbesModule.class);
    addModule(ProbeLocationsModule.class);

    addModule(ExpressionModule.class);
    // addModule(ClsModule.class);
    // addModule(PermuteClsModule.class);

    // addModule(GseaPlotModule.class);

    addModule(RegionsModule.class);

    addModule(GeneAnnotationModule.class);

    addModule(ConversionModule.class);

    addModule(GeneInfoModule.class);

    addModule(DnaModule.class);
    addModule(FastaWriterModule.class);

    addModule(MotifsModule.class);

    //
    // Bio modules
    //

    addModule(NewDendrogramModule.class);

    addModule(PatternDiscoveryModule.class);

    // ddModule(ClassifierModule.class);

    addModule(PathwayModule.class);

    addModule(IdeogramModule.class);
  }
}
