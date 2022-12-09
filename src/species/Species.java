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
   * @param p_species set name of Species
   */
  public void setSpecies(String p_species){
    m_species = p_species;
  };
  
  /**
   * @return the name member of Species of the Species
   */
  public String getSpecies(){
    return m_species;
  }

  /**
   * @param p_gestationTime  set gestationTime member of Species in month
   */
  public void setGestationTime(int p_gestationTime) {
    m_gestationTime = p_gestationTime;
  };

  /**
   * @return gestationTime member of Species value in month
   */
  public int getGestationTime() {
    return m_gestationTime;
  }

  /**
   * @param p_lifeExpectancy set lifeExpectancy member of Species value in years
   */
  public void setLifeExpectancy(int p_lifeExpectancy) {
    m_lifeExpectancy = p_lifeExpectancy;
  };

  /**
   * @return lifeExpectancy member of Species value in years
   */
  public int getLifeExpectancy() {
    return m_lifeExpectancy;
  }

  /**
   * @param p_race set String race member of Species 
   */
  public void setRace(String p_race) {
    m_race = p_race;
  } 
  
  /**
   * @return String race member of Species
   */
  public String getRace() {
    return m_race;
  }

}
