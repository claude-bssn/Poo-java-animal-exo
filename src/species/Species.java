package src.species;

public class Species {
  private String m_species;
  private int m_gestationTime;
  private int m_lifeExpectancy;
  private String m_race;

  // Species constructor
  protected Species(/* args */)
  {
  }

// LifeExpectancy setter & getter 
  public void setSpecies(String p_species){
    m_species = p_species;
  };

  public String getSpecies(){
    return m_species;
  }

    
// GestationTime setter & getter
  public void setGestationTime(int p_gestationTime) {
    m_gestationTime = p_gestationTime;
  };

  public int getGestationTime() {
    return m_gestationTime;
  }

// LifeExpectancy setter & getter
  public void setLifeExpectancy(int p_lifeExpectancy) {
    m_lifeExpectancy = p_lifeExpectancy;
  };

  public int getLifeExpectancy() {
    return m_lifeExpectancy;
  }

// race setter & getter
  public void setRace(String p_race) {
    m_race = p_race;
  } 
  public String getRace() {
    return m_race;
  }

}
