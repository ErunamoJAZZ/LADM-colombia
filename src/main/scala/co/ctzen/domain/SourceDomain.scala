package co.ctzen.domain

/**
  * Created by cdsanchez on 5/09/16.
  */
object SourceDomain {

  type COL_TransaccionRegistralTipo = COL_TransaccionRegistralTipo.Value
  type COL_AvailabilityStatusType = COL_AvailabilityStatusType.Value

  /**
    *
    */
  object COL_TransaccionRegistralTipo extends Enumeration {
    val
    ToDo
    = Value
  }

  /**
    *
    */
  object COL_AvailabilityStatusType extends Enumeration {
    val
    ToDo
    = Value
  }

}
