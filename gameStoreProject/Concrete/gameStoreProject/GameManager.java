package gameStoreProject;

public class GameManager implements GameService {

	@Override
	public void save(Game game) {
		
		System.out.println(game.getGameName() + " isimli oyun kaydedildi");
		
	}

	@Override
	public void update(Game game) {
		 
		
	}

	@Override
	public void delete(Game game) {
		// TODO Auto-generated method stub
		
	}

}
