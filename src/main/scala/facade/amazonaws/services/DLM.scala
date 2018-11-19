package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object dlm {
  type CopyTags = Boolean
  type Count = Int
  type ExecutionRoleArn = String
  type GettablePolicyStateValues = String
  type Interval = Int
  type IntervalUnitValues = String
  type LifecyclePolicySummaryList = js.Array[LifecyclePolicySummary]
  type PolicyDescription = String
  type PolicyId = String
  type PolicyIdList = js.Array[PolicyId]
  type ResourceTypeValues = String
  type ResourceTypeValuesList = js.Array[ResourceTypeValues]
  type ScheduleList = js.Array[Schedule]
  type ScheduleName = String
  type SettablePolicyStateValues = String
  type TagFilter = String
  type TagsToAddFilterList = js.Array[TagFilter]
  type TagsToAddList = js.Array[Tag]
  type TargetTagList = js.Array[Tag]
  type TargetTagsFilterList = js.Array[TagFilter]
  type Time = String
  type TimesList = js.Array[Time]
  type Timestamp = js.Date
}

package dlm {
  @js.native
  @JSImport("aws-sdk", "DLM")
  class DLM(config: AWSConfig) extends js.Object {
    def createLifecyclePolicy(params: CreateLifecyclePolicyRequest): Request[CreateLifecyclePolicyResponse] = js.native
    def deleteLifecyclePolicy(params: DeleteLifecyclePolicyRequest): Request[DeleteLifecyclePolicyResponse] = js.native
    def getLifecyclePolicies(params: GetLifecyclePoliciesRequest): Request[GetLifecyclePoliciesResponse] = js.native
    def getLifecyclePolicy(params: GetLifecyclePolicyRequest): Request[GetLifecyclePolicyResponse] = js.native
    def updateLifecyclePolicy(params: UpdateLifecyclePolicyRequest): Request[UpdateLifecyclePolicyResponse] = js.native
  }

  @js.native
  trait CreateLifecyclePolicyRequest extends js.Object {
    var ExecutionRoleArn: js.UndefOr[ExecutionRoleArn]
    var Description: js.UndefOr[PolicyDescription]
    var State: js.UndefOr[SettablePolicyStateValues]
    var PolicyDetails: js.UndefOr[PolicyDetails]
  }

  object CreateLifecyclePolicyRequest {
    def apply(
      ExecutionRoleArn: js.UndefOr[ExecutionRoleArn] = js.undefined,
      Description: js.UndefOr[PolicyDescription] = js.undefined,
      State: js.UndefOr[SettablePolicyStateValues] = js.undefined,
      PolicyDetails: js.UndefOr[PolicyDetails] = js.undefined): CreateLifecyclePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExecutionRoleArn" -> ExecutionRoleArn.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "PolicyDetails" -> PolicyDetails.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLifecyclePolicyRequest]
    }
  }

  @js.native
  trait CreateLifecyclePolicyResponse extends js.Object {
    var PolicyId: js.UndefOr[PolicyId]
  }

  object CreateLifecyclePolicyResponse {
    def apply(
      PolicyId: js.UndefOr[PolicyId] = js.undefined): CreateLifecyclePolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyId" -> PolicyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLifecyclePolicyResponse]
    }
  }

  /**
   * <p>Specifies when to create snapshots of EBS volumes.</p>
   */
  @js.native
  trait CreateRule extends js.Object {
    var Interval: js.UndefOr[Interval]
    var IntervalUnit: js.UndefOr[IntervalUnitValues]
    var Times: js.UndefOr[TimesList]
  }

  object CreateRule {
    def apply(
      Interval: js.UndefOr[Interval] = js.undefined,
      IntervalUnit: js.UndefOr[IntervalUnitValues] = js.undefined,
      Times: js.UndefOr[TimesList] = js.undefined): CreateRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Interval" -> Interval.map { x => x.asInstanceOf[js.Any] },
        "IntervalUnit" -> IntervalUnit.map { x => x.asInstanceOf[js.Any] },
        "Times" -> Times.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRule]
    }
  }

  @js.native
  trait DeleteLifecyclePolicyRequest extends js.Object {
    var PolicyId: js.UndefOr[PolicyId]
  }

  object DeleteLifecyclePolicyRequest {
    def apply(
      PolicyId: js.UndefOr[PolicyId] = js.undefined): DeleteLifecyclePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyId" -> PolicyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLifecyclePolicyRequest]
    }
  }

  @js.native
  trait DeleteLifecyclePolicyResponse extends js.Object {

  }

  object DeleteLifecyclePolicyResponse {
    def apply(): DeleteLifecyclePolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLifecyclePolicyResponse]
    }
  }

  @js.native
  trait GetLifecyclePoliciesRequest extends js.Object {
    var TargetTags: js.UndefOr[TargetTagsFilterList]
    var PolicyIds: js.UndefOr[PolicyIdList]
    var TagsToAdd: js.UndefOr[TagsToAddFilterList]
    var ResourceTypes: js.UndefOr[ResourceTypeValuesList]
    var State: js.UndefOr[GettablePolicyStateValues]
  }

  object GetLifecyclePoliciesRequest {
    def apply(
      TargetTags: js.UndefOr[TargetTagsFilterList] = js.undefined,
      PolicyIds: js.UndefOr[PolicyIdList] = js.undefined,
      TagsToAdd: js.UndefOr[TagsToAddFilterList] = js.undefined,
      ResourceTypes: js.UndefOr[ResourceTypeValuesList] = js.undefined,
      State: js.UndefOr[GettablePolicyStateValues] = js.undefined): GetLifecyclePoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetTags" -> TargetTags.map { x => x.asInstanceOf[js.Any] },
        "PolicyIds" -> PolicyIds.map { x => x.asInstanceOf[js.Any] },
        "TagsToAdd" -> TagsToAdd.map { x => x.asInstanceOf[js.Any] },
        "ResourceTypes" -> ResourceTypes.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLifecyclePoliciesRequest]
    }
  }

  @js.native
  trait GetLifecyclePoliciesResponse extends js.Object {
    var Policies: js.UndefOr[LifecyclePolicySummaryList]
  }

  object GetLifecyclePoliciesResponse {
    def apply(
      Policies: js.UndefOr[LifecyclePolicySummaryList] = js.undefined): GetLifecyclePoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Policies" -> Policies.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLifecyclePoliciesResponse]
    }
  }

  @js.native
  trait GetLifecyclePolicyRequest extends js.Object {
    var PolicyId: js.UndefOr[PolicyId]
  }

  object GetLifecyclePolicyRequest {
    def apply(
      PolicyId: js.UndefOr[PolicyId] = js.undefined): GetLifecyclePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyId" -> PolicyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLifecyclePolicyRequest]
    }
  }

  @js.native
  trait GetLifecyclePolicyResponse extends js.Object {
    var Policy: js.UndefOr[LifecyclePolicy]
  }

  object GetLifecyclePolicyResponse {
    def apply(
      Policy: js.UndefOr[LifecyclePolicy] = js.undefined): GetLifecyclePolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Policy" -> Policy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLifecyclePolicyResponse]
    }
  }

  object GettablePolicyStateValuesEnum {
    val ENABLED = "ENABLED"
    val DISABLED = "DISABLED"
    val ERROR = "ERROR"

    val values = IndexedSeq(ENABLED, DISABLED, ERROR)
  }

  object IntervalUnitValuesEnum {
    val HOURS = "HOURS"

    val values = IndexedSeq(HOURS)
  }

  /**
   * <p>Detailed information about a lifecycle policy.</p>
   */
  @js.native
  trait LifecyclePolicy extends js.Object {
    var PolicyId: js.UndefOr[PolicyId]
    var DateModified: js.UndefOr[Timestamp]
    var Description: js.UndefOr[PolicyDescription]
    var PolicyDetails: js.UndefOr[PolicyDetails]
    var DateCreated: js.UndefOr[Timestamp]
    var State: js.UndefOr[GettablePolicyStateValues]
    var ExecutionRoleArn: js.UndefOr[ExecutionRoleArn]
  }

  object LifecyclePolicy {
    def apply(
      PolicyId: js.UndefOr[PolicyId] = js.undefined,
      DateModified: js.UndefOr[Timestamp] = js.undefined,
      Description: js.UndefOr[PolicyDescription] = js.undefined,
      PolicyDetails: js.UndefOr[PolicyDetails] = js.undefined,
      DateCreated: js.UndefOr[Timestamp] = js.undefined,
      State: js.UndefOr[GettablePolicyStateValues] = js.undefined,
      ExecutionRoleArn: js.UndefOr[ExecutionRoleArn] = js.undefined): LifecyclePolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyId" -> PolicyId.map { x => x.asInstanceOf[js.Any] },
        "DateModified" -> DateModified.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "PolicyDetails" -> PolicyDetails.map { x => x.asInstanceOf[js.Any] },
        "DateCreated" -> DateCreated.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "ExecutionRoleArn" -> ExecutionRoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LifecyclePolicy]
    }
  }

  /**
   * <p>Summary information about a lifecycle policy.</p>
   */
  @js.native
  trait LifecyclePolicySummary extends js.Object {
    var PolicyId: js.UndefOr[PolicyId]
    var Description: js.UndefOr[PolicyDescription]
    var State: js.UndefOr[GettablePolicyStateValues]
  }

  object LifecyclePolicySummary {
    def apply(
      PolicyId: js.UndefOr[PolicyId] = js.undefined,
      Description: js.UndefOr[PolicyDescription] = js.undefined,
      State: js.UndefOr[GettablePolicyStateValues] = js.undefined): LifecyclePolicySummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyId" -> PolicyId.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LifecyclePolicySummary]
    }
  }

  /**
   * <p>Specifies the configuration of a lifecycle policy.</p>
   */
  @js.native
  trait PolicyDetails extends js.Object {
    var ResourceTypes: js.UndefOr[ResourceTypeValuesList]
    var TargetTags: js.UndefOr[TargetTagList]
    var Schedules: js.UndefOr[ScheduleList]
  }

  object PolicyDetails {
    def apply(
      ResourceTypes: js.UndefOr[ResourceTypeValuesList] = js.undefined,
      TargetTags: js.UndefOr[TargetTagList] = js.undefined,
      Schedules: js.UndefOr[ScheduleList] = js.undefined): PolicyDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceTypes" -> ResourceTypes.map { x => x.asInstanceOf[js.Any] },
        "TargetTags" -> TargetTags.map { x => x.asInstanceOf[js.Any] },
        "Schedules" -> Schedules.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyDetails]
    }
  }

  object ResourceTypeValuesEnum {
    val VOLUME = "VOLUME"

    val values = IndexedSeq(VOLUME)
  }

  /**
   * <p>Specifies the number of snapshots to keep for each EBS volume.</p>
   */
  @js.native
  trait RetainRule extends js.Object {
    var Count: js.UndefOr[Count]
  }

  object RetainRule {
    def apply(
      Count: js.UndefOr[Count] = js.undefined): RetainRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Count" -> Count.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RetainRule]
    }
  }

  /**
   * <p>Specifies a schedule.</p>
   */
  @js.native
  trait Schedule extends js.Object {
    var Name: js.UndefOr[ScheduleName]
    var RetainRule: js.UndefOr[RetainRule]
    var TagsToAdd: js.UndefOr[TagsToAddList]
    var CopyTags: js.UndefOr[CopyTags]
    var CreateRule: js.UndefOr[CreateRule]
  }

  object Schedule {
    def apply(
      Name: js.UndefOr[ScheduleName] = js.undefined,
      RetainRule: js.UndefOr[RetainRule] = js.undefined,
      TagsToAdd: js.UndefOr[TagsToAddList] = js.undefined,
      CopyTags: js.UndefOr[CopyTags] = js.undefined,
      CreateRule: js.UndefOr[CreateRule] = js.undefined): Schedule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "RetainRule" -> RetainRule.map { x => x.asInstanceOf[js.Any] },
        "TagsToAdd" -> TagsToAdd.map { x => x.asInstanceOf[js.Any] },
        "CopyTags" -> CopyTags.map { x => x.asInstanceOf[js.Any] },
        "CreateRule" -> CreateRule.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Schedule]
    }
  }

  object SettablePolicyStateValuesEnum {
    val ENABLED = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, DISABLED)
  }

  /**
   * <p>Specifies a tag for a resource.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object Tag {
    def apply(
      Key: js.UndefOr[String] = js.undefined,
      Value: js.UndefOr[String] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  @js.native
  trait UpdateLifecyclePolicyRequest extends js.Object {
    var PolicyId: js.UndefOr[PolicyId]
    var Description: js.UndefOr[PolicyDescription]
    var PolicyDetails: js.UndefOr[PolicyDetails]
    var State: js.UndefOr[SettablePolicyStateValues]
    var ExecutionRoleArn: js.UndefOr[ExecutionRoleArn]
  }

  object UpdateLifecyclePolicyRequest {
    def apply(
      PolicyId: js.UndefOr[PolicyId] = js.undefined,
      Description: js.UndefOr[PolicyDescription] = js.undefined,
      PolicyDetails: js.UndefOr[PolicyDetails] = js.undefined,
      State: js.UndefOr[SettablePolicyStateValues] = js.undefined,
      ExecutionRoleArn: js.UndefOr[ExecutionRoleArn] = js.undefined): UpdateLifecyclePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyId" -> PolicyId.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "PolicyDetails" -> PolicyDetails.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "ExecutionRoleArn" -> ExecutionRoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateLifecyclePolicyRequest]
    }
  }

  @js.native
  trait UpdateLifecyclePolicyResponse extends js.Object {

  }

  object UpdateLifecyclePolicyResponse {
    def apply(): UpdateLifecyclePolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateLifecyclePolicyResponse]
    }
  }
}
