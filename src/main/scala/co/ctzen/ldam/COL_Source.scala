package co.ctzen.ldam

import java.time.LocalDateTime

import co.ctzen.domain.AdministrativeDomain.COL_AdministrativeSourceType
import co.ctzen.domain.SourceDomain.{COL_TransaccionRegistralTipo, COL_AvailabilityStatusType}
import co.ctzen.domain.SurveyingDomain.COL_SpatialSourceType
import co.ctzen.domain.types._

/**
  * Created by jvallejo on 5/09/16.
  */
trait COL_Source {
  val acceptance: Option[LocalDateTime]
  val availabilityStatus: COL_AvailabilityStatusType
  val extArchiveID: Option[ExtArchive]
  val fuente: Cl_ResponsibleParty
  val lifeSpanStamp: Option[LocalDateTime]
  val maintype: Option[Cl_PresentationFormCode] // TODO NO està en Camel Case
  val oficialidad: Seq[Boolean] // 0...*
  val recordation: LocalDateTime
  val sID: Oid
  val submission: Option[LocalDateTime]
  val tipoTransaccion: Option[COL_TransaccionRegistralTipo]
}

case class
COL_AdministrativeSource(
                         override val acceptance: Option[LocalDateTime],
                         override val availabilityStatus: COL_AvailabilityStatusType,
                         override val extArchiveID: Option[ExtArchive],
                         override val fuente: Cl_ResponsibleParty,
                         override val lifeSpanStamp: Option[LocalDateTime],
                         override val maintype: Option[Cl_PresentationFormCode], // TODO NO està en Camel Case
                         override val oficialidad: Seq[Boolean], // 0...*
                         override val recordation: LocalDateTime,
                         override val sID: Oid,
                         override val submission: Option[LocalDateTime],
                         override val tipoTransaccion: Option[COL_TransaccionRegistralTipo],
                         text: Option[MultiMediaType],
                         tipo: COL_AdministrativeSourceType,
                         demanda: Seq[COL_Demanda], // Asociación con tabla COL_Demanda TODO revisar cardinalidad
                         rrr: Seq[COL_RRR], // Asociación con tabla COL_RRR
                         requiredRelationBaunit: Seq[LA_RequiredRelationshipBAUnit], // Asociación con la tabla LA_RequiredRelationshipBAUnit
                         unit: Seq[COL_BAUnit], // Asociación con COL_BAUnit
                         representedBy: Option[COL_Party], // Asociación con COL_Party 0.. 1 TODO revisar nombre
                         conveyancer: Seq[COL_Party] // Asociación con COL_Party TODO revisar nombre y cardinalidad 1..*
                        ) extends COL_Source


case class
COL_SpatialSource(
                    override val acceptance: Option[LocalDateTime],
                    override val availabilityStatus: COL_AvailabilityStatusType,
                    override val extArchiveID: Option[ExtArchive],
                    override val fuente: Cl_ResponsibleParty,
                    override val lifeSpanStamp: Option[LocalDateTime],
                    override val maintype: Option[Cl_PresentationFormCode], // TODO NO està en Camel Case
                    override val oficialidad: Seq[Boolean], // 0...*
                    override val recordation: LocalDateTime,
                    override val sID: Oid,
                    override val submission: Option[LocalDateTime],
                    override val tipoTransaccion: Option[COL_TransaccionRegistralTipo],
                    mediciones: Seq[OM_Observation], //  0.. *
                    procedimiento: Option[OM_Process],
                    quality: Option[DQ_Element],
                    `type`: COL_SpatialSourceType
                  ) extends COL_Source
