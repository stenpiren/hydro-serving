package io.hydrosphere.serving.manager.controller.application

import io.hydrosphere.serving.manager.model.db.ApplicationKafkaStream

case class CreateApplicationRequest(
  name: String,
  namespace: Option[String],
  executionGraph: ExecutionGraphRequest,
  kafkaStreaming: List[ApplicationKafkaStream]
)

object CreateApplicationRequest {
  import io.hydrosphere.serving.manager.model.protocol.CompleteJsonProtocol._
  implicit val format = jsonFormat4(CreateApplicationRequest.apply)
}