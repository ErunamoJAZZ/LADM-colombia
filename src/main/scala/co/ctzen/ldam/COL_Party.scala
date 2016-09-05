package co.ctzen.ldam

import java.time.LocalDate

import co.ctzen.domain.PartyDomain.{COL_GroupPartyType, COL_PartyDocumentoTipo, COL_PartyRoleType, COL_PartyType}
import co.ctzen.domain.types.{COL_InstitucionTipo, Oid}

/**
  * Created by cdsanchez on 3/09/16.
  */
trait COL_Party {
  val cedula_pasaporte: Option[Oid]
  //TODO, no se ajusta al camelCase, y por que esto aparte del documento??
  val correoElectronico: String
  //TODO, obligatorio???
  val fechaNacimiento: LocalDate
  val genero: Boolean
  //TODO no se ajusta a estadares internacionales (ISO/IEC 5218)
  val institucion: COL_InstitucionTipo
  // TODO, no está definido
  val numeroDocumento: Int
  val papel: Seq[COL_PartyRoleType]
  // 0..*
  val pID: Oid
  val primerApellido: Option[String]
  val primerNombre: Option[String]
  val razonSocial: Option[String]
  val segundoApellido: Option[String]
  val segundoNombre: Option[String]
  val telefono: String
  //Todo Obligatorio?
  val tipo: COL_PartyType
  val tipoDocumento: COL_PartyDocumentoTipo
}


case class
COL_GroupParty(
                override val cedula_pasaporte: Option[Oid],
                override val correoElectronico: String,
                override val fechaNacimiento: LocalDate,
                override val genero: Boolean,
                override val institucion: COL_InstitucionTipo,
                override val numeroDocumento: Int,
                override val papel: Seq[COL_PartyRoleType],
                override val pID: Oid,
                override val primerApellido: Option[String],
                override val primerNombre: Option[String],
                override val razonSocial: Option[String],
                override val segundoApellido: Option[String],
                override val segundoNombre: Option[String],
                override val telefono: String,
                override val tipo: COL_PartyType,
                override val tipoDocumento: COL_PartyDocumentoTipo,
                groupID: Oid,
                nombre: String, //Todo, dice char??
                `type`: COL_GroupPartyType
              ) extends COL_Party