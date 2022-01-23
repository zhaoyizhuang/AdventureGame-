
import model.dungeon.DungeonGame;
import model.dungeon.DungeonTest;

/**
 * This class serve as a shortcut for the designed Dungeon for test purpose only.
 * It contains several static method which create two test dungeon.
 */
public final class TestDungeon {

  /**
   * One test dungeon game. two monsters. wrapping.
   * @return a dungeon for test
   */
  public static DungeonGame testDungeon1() {
    DungeonGame model = new DungeonTest();
    ((DungeonTest) model).setRand(10 ,66 ,61 ,6 ,20 ,46 ,45 ,8 ,40 ,5 ,19 ,7 ,20 ,26 ,27 ,48 ,34 ,
            52 ,36 ,52 ,40 ,20 ,7 ,48 ,30 ,34 ,3 ,43 ,32 ,9 ,7 ,9 ,28 ,36 ,0 ,19 ,28 ,1 ,22 ,17 ,
            16 ,27 ,23 ,6 ,23 ,26 ,0 ,2 ,1 ,8 ,6 ,17 ,13 ,17 ,16 ,14 ,13 ,10 ,9 ,6 ,4 ,0 ,0 ,2 ,7 ,
            2 ,1 ,3 ,3 ,0 ,0 ,0 ,4 ,2 ,8 ,31 ,2 ,6 ,2 ,14 ,1 ,31 ,1 ,2 ,1 ,30 ,1 ,17 ,2 ,15 ,2 ,36 ,
            2 ,12 ,1 ,16 ,1 ,33 ,1 ,18 ,2 ,22 ,2 ,3 ,2 ,20 ,2 ,24 ,2 ,32 ,2 ,3 ,1 ,11 ,1 ,33 ,1 ,
            32 ,1 ,2 ,1 ,18 ,1 ,8 ,2 ,22 ,1 ,22 ,1 ,17 ,1 ,31 ,1 ,8 ,1 ,24 ,2 ,27 ,2 ,18 ,1 ,21 ,2 ,
            16 ,1 ,16 ,2 ,35 ,2 ,2 ,1 ,14 ,2 ,2 ,2 ,33 ,1 ,2 ,1 ,23 ,1 ,2 ,2 ,27 ,2 ,1 ,1 ,26 ,1 ,
            1 ,2 ,33 ,1 ,1 ,2 ,23 ,4 ,2 ,2 ,1 ,15 ,2 ,1 ,2 ,34 ,1 ,1 ,1 ,21 ,1 ,2 ,2 ,17 ,2 ,1 ,1 ,
            24 ,0 ,2 ,1 ,2 ,24 ,22 ,2 ,2 ,1 ,32 ,34 ,4 ,2 ,1 ,2 ,36 ,3 ,1 ,1 ,2 ,6 ,10 ,2 ,1 ,1 ,
            14 ,2 ,30 ,1 ,1 ,2 ,0 ,12 ,1 ,2 ,2 ,13 ,5 ,25 ,15 ,36 ,10 ,2 ,2 ,1 ,8 ,1 ,2 ,1 ,34 ,21 ,
            2 ,27 ,1 ,1 ,2 ,13 ,21 ,35 ,27 ,1 ,12 ,29 ,35 ,3 ,20 ,2 ,2 ,2 ,5 ,21 ,16 ,29 ,7 ,17 ,1 ,
            1 ,1 ,9 ,13 ,16 ,36 ,19 ,1 ,2 ,1 ,25 ,20);
    ((DungeonTest) model).setCaves(6, 6, 10, true, 100, 2);
    return model;
  }

  /**
   * One test dungeon game. 15 monsters. Non-wrapping.
   * @return a dungeon for test
   */
  public static DungeonGame testDungeon2() {
    DungeonGame m = new DungeonTest();
    ((DungeonTest) m).setRand(17 ,47 ,22 ,33 ,2 ,26 ,10 ,40 ,15 ,43 ,19 ,19 ,11 ,0 ,3 ,23 ,32 ,19 ,
            6 ,35 ,2 ,9 ,25 ,0 ,2 ,11 ,13 ,0 ,31 ,14 ,12 ,28 ,22 ,4 ,17 ,10 ,18 ,5 ,21 ,20 ,5 ,17 ,
            4 ,9 ,7 ,4 ,6 ,2 ,4 ,7 ,7 ,5 ,6 ,2 ,5 ,0 ,0 ,1 ,0 ,0 ,1 ,1 ,4 ,3 ,4 ,1 ,5 ,21 ,1 ,28 ,
            2 ,15 ,2 ,26 ,2 ,30 ,2 ,18 ,2 ,3 ,1 ,6 ,1 ,18 ,1 ,6 ,2 ,34 ,2 ,25 ,2 ,15 ,2 ,8 ,1 ,14 ,
            1 ,28 ,1 ,36 ,2 ,11 ,1 ,35 ,2 ,14 ,1 ,21 ,2 ,32 ,2 ,20 ,1 ,24 ,2 ,1 ,1 ,21 ,1 ,1 ,2 ,
            13 ,1 ,17 ,1 ,4 ,2 ,15 ,2 ,7 ,1 ,5 ,1 ,21 ,1 ,27 ,1 ,23 ,1 ,26 ,7 ,31 ,1 ,2 ,2 ,13 ,1 ,
            2 ,2 ,27 ,8 ,1 ,27 ,25 ,1 ,2 ,2 ,28 ,1 ,2 ,2 ,24 ,27 ,22 ,29 ,5 ,2 ,2 ,2 ,9 ,1 ,1 ,2 ,
            30 ,2 ,1 ,2 ,21 ,1 ,2 ,2 ,22 ,26 ,34 ,2 ,2 ,1 ,7 ,13 ,16 ,1 ,2 ,2 ,34 ,34 ,3 ,35 ,25 ,
            34 ,34 ,4 ,23 ,15 ,2 ,1 ,2 ,1 ,20 ,1 ,2 ,1 ,26 ,26 ,23 ,26 ,27 ,3 ,4 ,32 ,1 ,1 ,2 ,14 ,
            24 ,33 ,11 ,1 ,1 ,2 ,11 ,1 ,2 ,1 ,1 ,1 ,32 ,9 ,23 ,35 ,23 ,26 ,26 ,30 ,20 ,16 ,1 ,2 ,
            2 ,32 ,19 ,2 ,1 ,2 ,9 ,16 ,1 ,2 ,2 ,5 ,4 ,1 ,14 ,34 ,30 ,6 ,14 ,3 ,24 ,16 ,20 ,6 ,12 ,
            36 ,1 ,2 ,2 ,3 ,21 ,21 ,31 ,5 ,27 ,5 ,30 ,16 ,32 ,20 ,22 ,36 ,9 ,19 ,25 ,30 ,15 ,14 ,
            18 ,1 ,13 ,25 ,31 ,9 ,24 ,30 ,22 ,32 ,26 ,24 ,4 ,30 ,21 ,18 ,15 ,8 ,1 ,26 ,6 ,8 ,20 ,
            25 ,8 ,26 ,16 ,13 ,5 ,3 ,26 ,21 ,0 ,21 ,25 ,24 ,26 ,28, 0, 0, 0, 0, 0);
    ((DungeonTest) m).setCaves(6, 6, 0, false, 100, 15);
    return m;
  }

}
