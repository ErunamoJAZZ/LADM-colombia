package co.ctzen.domain

import co.ctzen.domain.types.{CC_OperationMethod, GM_Point}

/**
  * Created by cdsanchez on 5/09/16.
  */
object SurveyingDomain {

  case class LA_Transformation(
                                transformation: CC_OperationMethod,
                                transformedLocation: GM_Point
                              )

  type COL_SpatialSourceType = COL_SpatialSourceType.Value
  type COL_MonumentacionTipo = COL_MonumentacionTipo.Value
  type COL_InterpolacionTipo = COL_InterpolacionTipo.Value
  type COL_Descripcion = COL_Descripcion.Value
  type COL_ViaTipo = COL_ViaTipo.Value

  type COL_DefPuntoTipo = COL_DefPuntoTipo.Value
  type COL_PointTipo = COL_PointTipo.Value
  type COL_FuenteTipo = COL_FuenteTipo.Value
  type COL_AcuerdoTipo = COL_AcuerdoTipo.Value
  type COL_OtrasEsctructurasTipo = COL_OtrasEsctructurasTipo.Value

  /**
    *
    */
  object COL_SpatialSourceType extends Enumeration {
    val
    ToDo
    = Value
  }

  /**
    *
    */
  object COL_MonumentacionTipo extends Enumeration {
    val
    ToDo
    = Value
  }

  /**
    *
    */
  object COL_InterpolacionTipo extends Enumeration {
    val
    ToDo
    = Value
  }

  /**
    *
    */
  object COL_Descripcion extends Enumeration {
    val
    ToDo
    = Value
  }

  /**
    *
    */
  object COL_ViaTipo extends Enumeration {
    val
    ToDo
    = Value
  }

  /**
    *
    */
  object COL_DefPuntoTipo extends Enumeration {
    val
    ToDo
    = Value
  }

  /**
    *
    */
  object COL_PointTipo extends Enumeration {
    val
    ToDo
    = Value
  }

  /**
    *
    */
  object COL_FuenteTipo extends Enumeration {
    val
    ToDo
    = Value
  }

  /**
    *
    */
  object COL_AcuerdoTipo extends Enumeration {
    val
    ToDo
    = Value
  }

  /**
    *
    */
  object COL_OtrasEsctructurasTipo extends Enumeration {
    val
    ToDo
    = Value
  }

}
