package co.ctzen.ldam

import java.time.LocalDateTime

import co.ctzen.domain.AdministrativeDomain.COL_DemandaTipo

/**
  * Created by jvallejo on 6/09/16.
  */
case class COL_Demanda(
                        lifeStamp: LocalDateTime,
                        tipo: COL_DemandaTipo,
                        unit: Seq[COL_BAUnit], // Asociación con la tabla COL_BAUnit TODO verificar cardinalidad
                        party: Seq[COL_Party], // Asociación con la tabla COL_Party TODO verificar cardinalidad
                        source: Seq[COL_AdministrativeSource] // Asociación con la tabla COL_AdministrativeSource TODO verificar cardinalidad
                      )

