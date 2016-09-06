package co.ctzen.ldam

import co.ctzen.domain.types.ISO19125_Type

/**
  * Created by jvallejo on 6/09/16.
  */
case class
LA_RequiredRelationshipSpatialUnit (
                                      relationship: ISO19125_Type, // TODO revisar si correcto el tipo
                                      source: Seq[COL_SpatialSource], // Asociación con COL_SpatialSource
                                      su1: LA_SpatialUnit, // Asociación con  LA_SpatialUnit TODO verificar si es correcto este diseño
                                      su2: LA_SpatialUnit // Asociación con LA_SpatialUnit TODO verificar si es correcto este diseño
                                   )

