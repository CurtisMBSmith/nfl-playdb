package nfl.playdb.app;


import nfl.playdb.dao.PlayerDAO;
import nfl.playdb.model.gen.Player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EntityScan(basePackages={"nfl.playdb.model.gen"})
public class NFLDataAnalyzer implements CommandLineRunner {

	@Autowired
	PlayerDAO playerDAO;

	private static ApplicationContext ctx;

	public static void main(final String... args) {
		ctx = SpringApplication.run(NFLDataAnalyzer.class, args);
	}

	@Override
	public void run(final String... args) throws Exception {

		final Player player = playerDAO.findOne("KC-0900");
		System.out.println("[" + player.getCteam() + "] " + player.getPname());
	}
}
