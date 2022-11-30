package src.species;

public class Species {
  private String m_species;
  private int m_gestationTime;
  private int m_lifeExpectancy;
  private String m_race;

  /**
   * Species constructor
   */
  protected Species(/* args */)
  {
  }

  /**
   * @param p_species
   */
  public void setSpecies(String p_species){
    m_species = p_species;
  };
  
  /**
   * @return
   */
  public String getSpecies(){
    return m_species;
  }

  /**
   * @param p_gestationTime
   */
  public void setGestationTime(int p_gestationTime) {
    m_gestationTime = p_gestationTime;
  };

  /**
   * @return
   */
  public int getGestationTime() {
    return m_gestationTime;
  }

  /**
   * @param p_lifeExpectancy
   */
  public void setLifeExpectancy(int p_lifeExpectancy) {
    m_lifeExpectancy = p_lifeExpectancy;
  };

  /**
   * @return
   */
  public int getLifeExpectancy() {
    return m_lifeExpectancy;
  }

  /**
   * @param p_race
   */
  public void setRace(String p_race) {
    m_race = p_race;
  } 
  
  /**
   * @return
   */
  public String getRace() {
    return m_race;
  }

}
