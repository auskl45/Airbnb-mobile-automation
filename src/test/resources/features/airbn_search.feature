Feature: Búsqueda en Airbnb

  @test
  Scenario: Búsqueda simple de hospedaje

    Given que me enuentro en el login de Airbnb
    # When busco "Hoteles en Vichayito"
    When busco "Hoteles en Vichay"
    Then muestra el texto "Over 1,000 stays"