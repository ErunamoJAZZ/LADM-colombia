package co.ctzen.ldam

/**
  * Created by jvallejo on 6/09/16.
  */
case class
LA_RequiredRelationshipSpatialUnit (
                                      relationship: String, // TODO revisar si correcto el tipo
                                      source: Seq[COL_SpatialSource] // Asociación con COL_SpatialSource
                                   )
