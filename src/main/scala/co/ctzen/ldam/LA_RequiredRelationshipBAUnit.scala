package co.ctzen.ldam

/**
  * Created by jvallejo on 6/09/16.
  */
case class LA_RequiredRelationshipBAUnit(
                                          relationship: String,
                                          source: Seq[COL_AdministrativeSource] // Asociación con la tabla COL_AdministrativeSource
                                        )

