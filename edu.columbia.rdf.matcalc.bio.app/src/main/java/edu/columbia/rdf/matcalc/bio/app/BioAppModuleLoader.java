package edu.columbia.rdf.matcalc.bio.app;

import org.matcalc.toolbox.bio.dna.DnaModule;
import org.matcalc.toolbox.bio.genes.GenesModule;
import org.matcalc.toolbox.bio.genes.annotation.GeneAnnotationModule;
import org.matcalc.toolbox.bio.genes.info.GeneInfoModule;
import org.matcalc.toolbox.bio.motifs.MotifsModule;
import org.matcalc.toolbox.bio.probes.ProbesModule;
import org.matcalc.toolbox.paste.PasteModule;

import edu.columbia.rdf.matcalc.bio.BioModuleLoader;
import edu.columbia.rdf.matcalc.bio.toolbox.expression.ExpressionModule;
import edu.columbia.rdf.matcalc.bio.toolbox.fillgaps.FillGapsModule;
import edu.columbia.rdf.matcalc.bio.toolbox.probes.CollapseModule;
import edu.columbia.rdf.matcalc.bio.toolbox.probes.ProbeLocationsModule;
import edu.columbia.rdf.matcalc.toolbox.bio.annotation.AnnotationModule;
import edu.columbia.rdf.matcalc.toolbox.ideogram.IdeogramModule;
import edu.columbia.rdf.matcalc.toolbox.newdendrogram.NewDendrogramModule;
import edu.columbia.rdf.matcalc.toolbox.pathway.PathwayModule;
import edu.columbia.rdf.matcalc.toolbox.patterndiscovery.PatternDiscoveryModule;
import edu.columbia.rdf.matcalc.toolbox.patterndiscovery.classifier.ClassifierModule;
import edu.columbia.rdf.matcalc.toolbox.regions.RegionsModule;



public class BioAppModuleLoader extends BioModuleLoader {
	public BioAppModuleLoader() {
		addModule(AnnotationModule.class);
		addModule(FillGapsModule.class);
		
		addModule(CollapseModule.class);
		
		addModule(ProbesModule.class);
		addModule(ProbeLocationsModule.class);
		
		addModule(ExpressionModule.class);
		//addModule(ClsModule.class);
		//addModule(PermuteClsModule.class);
		
		//addModule(GseaPlotModule.class);
		
		addModule(RegionsModule.class);
		
		addModule(GeneAnnotationModule.class);
		
		addModule(GenesModule.class);
		
		addModule(GeneInfoModule.class);
		
		addModule(DnaModule.class);

		addModule(MotifsModule.class);
		
		//
		// Bio modules
		//
		
		addModule(NewDendrogramModule.class);
		
		addModule(PatternDiscoveryModule.class);
		
		addModule(ClassifierModule.class);
		
		addModule(PathwayModule.class);
		
		addModule(IdeogramModule.class);
		
		//addModule(GepModule.class);
		
		addModule(PasteModule.class);
	}
}
