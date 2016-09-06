package co.ctzen.ldam

import java.time.temporal.TemporalAmount
import java.util.Currency

import co.ctzen.domain.AdministrativeDomain._
import co.ctzen.domain.types.{Fraction, ISO8601_ISO14825_Type, Oid}

/**
  * Created by cdsanchez on 3/09/16.
  */
trait COL_RRR {
  val rID: Oid
  val description: Option[String]
  val fraccion: Option[Fraction]
  //???
  val shareCheck: Option[Boolean]
  val vigencia: Option[ISO8601_ISO14825_Type]
  val party: Option[COL_Party] // Asociación con tabla COL_Party
  val source: Seq[COL_AdministrativeSource] // Asociación con tabla COL_AdministrativeSource TODO Obligatorio al menos uno
  val unit: COL_BAUnit // Asociación con tabla COL_BAUnit
}

trait traitCOL_Restriction extends COL_RRR {
  val partyRequired: Option[Boolean]
  val RestriccionDominio: Boolean
  val RestriccionOcupacion: Boolean
  val RestriccionUso: Boolean
}

case class
COL_Right(
           override val rID: Oid,
           override val description: Option[String],
           override val fraccion: Option[Fraction],
           override val shareCheck: Option[Boolean],
           override val vigencia: Option[ISO8601_ISO14825_Type],
           override val party: Option[COL_Party],
           override val source: Seq[COL_AdministrativeSource],
           override val unit: COL_BAUnit,
           tipo: COL_RightType,
           mortgage: Seq[LA_Mortgage] /// Asociaciòn con tabla LA_Mortgage 0.. *
         ) extends COL_RRR


case class
COL_Responsibility(
                    override val rID: Oid,
                    override val description: Option[String],
                    override val fraccion: Option[Fraction],
                    override val shareCheck: Option[Boolean],
                    override val vigencia: Option[ISO8601_ISO14825_Type],
                    override val party: Option[COL_Party],
                    override val source: Seq[COL_AdministrativeSource],
                    override val unit: COL_BAUnit,
                    tipo: COL_ResponsabilityType
                  ) extends COL_RRR


case class
COL_Restriction(
                 override val rID: Oid,
                 override val description: Option[String],
                 override val fraccion: Option[Fraction],
                 override val shareCheck: Option[Boolean],
                 override val vigencia: Option[ISO8601_ISO14825_Type],
                 override val partyRequired: Option[Boolean],
                 override val RestriccionDominio: Boolean,
                 override val RestriccionOcupacion: Boolean,
                 override val RestriccionUso: Boolean,
                 override val party: Option[COL_Party],
                 override val source: Seq[COL_AdministrativeSource],
                 override val unit: COL_BAUnit,
                 tipo: COL_RestrictionType
               ) extends traitCOL_Restriction


case class
LA_Mortgage(
              override val rID: Oid,
              override val description: Option[String],
              override val fraccion: Option[Fraction],
              override val shareCheck: Option[Boolean],
              override val vigencia: Option[ISO8601_ISO14825_Type],
              override val partyRequired: Option[Boolean],
              override val RestriccionDominio: Boolean,
              override val RestriccionUso: Boolean,
              override val RestriccionOcupacion: Boolean,
              override val party: Option[COL_Party],
              override val source: Seq[COL_AdministrativeSource],
              override val unit: COL_BAUnit,
              amount: Option[Currency],
              interestRate: Option[Double], //Real??
              ranking: Option[Int],
              tipo: Option[COL_MortgageType],
              right: Seq[COL_Right] /// Asociaciòn con tabla COL_Right 0.. * TODO ordered ??
           ) extends traitCOL_Restriction