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
}

trait traitCOL_Restriction extends COL_RRR {
  val partyRequired: Option[Boolean]
  val RestriccionDominio: Boolean
  val RestriccionUso: Boolean
  val RestriccionOcupacion: Boolean
}

case class
COL_Right(
           override val rID: Oid,
           override val description: Option[String],
           override val fraccion: Option[Fraction],
           override val shareCheck: Option[Boolean],
           override val vigencia: Option[ISO8601_ISO14825_Type],
           tipo: COL_RightType
         ) extends COL_RRR


case class
COL_Responsibility(
                    override val rID: Oid,
                    override val description: Option[String],
                    override val fraccion: Option[Fraction],
                    override val shareCheck: Option[Boolean],
                    override val vigencia: Option[ISO8601_ISO14825_Type],
                    tipo: COL_ResponsabilityType
                  ) extends COL_RRR


case class
COL_Restriction(
                 override val rID: Oid,
                 override val description: Option[String],
                 override val fraccion: Option[Fraction],
                 override val shareCheck: Option[Boolean],
                 override val vigencia: Option[ISO8601_ISO14825_Type],
                 partyRequired: Option[Boolean],
                 tipo: COL_RestrictionType,
                 RestriccionDominio: Boolean,
                 RestriccionUso: Boolean,
                 RestriccionOcupacion: Boolean
               ) extends traitCOL_Restriction


case class
LA_Mortgage(override val rID: Oid,
            override val description: Option[String],
            override val fraccion: Option[Fraction],
            override val shareCheck: Option[Boolean],
            override val vigencia: Option[ISO8601_ISO14825_Type],
            override val partyRequired: Option[Boolean],
            override val RestriccionDominio: Boolean,
            override val RestriccionUso: Boolean,
            override val RestriccionOcupacion: Boolean,
            amount: Option[Currency],
            interestRate: Option[Double], //Real??
            ranking: Option[Int],
            tipo: Option[COL_MortgageType]
           ) extends traitCOL_Restriction