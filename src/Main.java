
import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import net.sas.model.bean.Adresse;
import net.sas.model.bean.Employe;
import net.sas.model.bean.ExamenSante;
import net.sas.model.bean.Permis;
import net.sas.model.enums.Fonction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Main {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(
				configuration.getProperties()).buildServiceRegistry();
		SessionFactory factory = configuration.buildSessionFactory(registry);
		Session session = factory.openSession();
		Employe e = new Employe();
		try {
			e.setNom("abc");
			e.setPrenom("foo");
			
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			e.setDateNaissance(df.parse("14/10/1990"));
			
			Adresse adr = new Adresse();
			adr.setAdresse("rue 8");
			adr.setVille("casa");
			adr.setPays("maroc");
			adr.setZip(20420);
			e.setAdresse(adr);
			
			e.setPhone("05224444333");
			e.setEmail("test@test.com");
			
			Set<String> list = new LinkedHashSet<String>();
			list.add("eee");
			list.add("hhhh");
			e.setCertificats(list);
			
			e.setCin("B656");
			e.setDateEmbauche(new Date());
			
			ExamenSante ex = new ExamenSante();
			ex.setDateRealisation(df.parse("14/10/1990"));
			ex.setDateExpiration(new Date());
			e.setExamenSante(ex);
			
			e.setFonction(Fonction.CONDUCTEUR);
			e.setMatricule("hjk356YU");
			e.setNotes("azefghjklszdfhjkl");
			
			Permis p = new Permis();
			p.setNumero("456789");
			p.setType("B");
			p.setDateObtention(df.parse("14/10/1990"));
			p.setDateExpiration(new Date());
			e.setPermis(p);
			
			
			File file = new File("C:\\img.jpg");
			byte[] img = new byte[(int) file.length()];
			e.setPhoto(img);
			
			
			e.setTauxHoraire(20.5);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		session.save(e);
		session.flush();

	}
}
