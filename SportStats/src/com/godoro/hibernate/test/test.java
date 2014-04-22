package com.godoro.hibernate.test; 

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.javateam.sportstats.core.HibernameUtil;
import com.javateam.sportstats.entity.Cadre;
import com.javateam.sportstats.entity.Country;
import com.javateam.sportstats.entity.Image;
import com.javateam.sportstats.entity.League;
import com.javateam.sportstats.entity.Match;
import com.javateam.sportstats.entity.Player;
import com.javateam.sportstats.entity.Position;
import com.javateam.sportstats.entity.Season;
import com.javateam.sportstats.entity.SportType;
import com.javateam.sportstats.entity.Stand;
import com.javateam.sportstats.entity.Team;
import com.javateam.sportstats.repository.MatchRepository;
import com.javateam.sportstats.repository.PlayerRepository;
import com.javateam.sportstats.repository.SeasonRepository;
import com.javateam.sportstats.repository.TeamRepository;

public class test {
 
	public static void main(String[] args) {	
		
		Session session=HibernameUtil.getSession();   
		Transaction txn=session.beginTransaction();
	    
		/*SportType sportType=new SportType();
		sportType.setTypeName("Futbol");
		session.save(sportType);
		
		Season season=new Season();
		season.setSeasonName("2013-2014");	
		session.save(season);		
		
		Country country=new Country();
		country.setCountryName("Turkiye");
		session.save(country);
		
		League league=new League();
		league.setLeagueName("Süper Lig");
		league.setSeason(season);
		league.setCountry(country);
		league.setSportType(sportType);
		
		
		
		country.getLeaguies().add(league);
		season.getLeaguies().add(league);		
		session.save(league);
		
		Team home=new Team();
		home.setTeamName("Fenerbahçe");
		session.save(home);
		
		Team away=new Team();
		away.setTeamName("Galatasaray");		
		session.save(away);
		
		Match match=new Match();
		match.setLeague(league);
		match.setMatchDate(new Date());
		match.setMatchTime("20:00");
		match.setHalfTime(0);
		match.setFulltime(0);		
		match.setAwayTeam(away);
		match.setHomeTeam(home); 
		
		SportTypeRepository sportTypeRepository=new SportTypeRepository();
		SportType sportType=sportTypeRepository.find(1);
		sportTypeRepository.close();
		
		LeagueRepository repository=new LeagueRepository(League.class);
		League league=repository.find(Long.parseLong("1"));
		league.setSportType(sportType);
		repository.close();
		*/
		/*
		TeamRepository repository=new TeamRepository(Team.class);
		Team team= repository.find(Long.parseLong("1"));
		repository.close();
		
		Position position=new Position();
		position.setPositionName("Forvet");
		session.save(position);
		
		Image image=new Image();
		image.setName("sow_1");
		image.setUrl("image/sow_1");
		session.save(image);
		
		Player player=new Player();
		player.setName("Sow");
		player.setLastName("Bla Bla");
		player.getPosition().add(position);
		player.getImage().add(image); 
		player.setTeam(team);
		
		
		position.setPlayer(player);
		image.setPlayer(player); 
		session.save(player);
		
		MatchRepository matchRepository=new MatchRepository(Match.class);
		Match match= matchRepository.find(Long.parseLong("1"));
		matchRepository.close();
		
		TeamRepository repository=new TeamRepository(Team.class);
		Team team= repository.find(Long.parseLong("2"));
		repository.close();
		
		PlayerRepository playerRepository=new PlayerRepository(Player.class);
		Player player=playerRepository.find(Long.parseLong("1"));
		playerRepository.close();
		
		Cadre cadre=new Cadre();
		cadre.setMatch(match);
		cadre.setPlayer(player);
		cadre.setTeam(team);
		
	
		SeasonRepository seasonRepository=new SeasonRepository(Season.class);
		Season season=seasonRepository.find(Long.parseLong("1"));
		seasonRepository.close();
		
		TeamRepository repository=new TeamRepository(Team.class);
		Team team= repository.find(Long.parseLong("1"));
		repository.close();
		
		Stand stand=new Stand(season, team, 1, 1, 0, 0, 6, 3);
		*/
		
		//session.saveOrUpdate(cadre);
		txn.commit();		
		session.close();
	}
}
