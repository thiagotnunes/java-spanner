/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/admin/database/v1/spanner_database_admin.proto

package com.google.spanner.admin.database.v1;

public interface UpdateDatabaseRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.admin.database.v1.UpdateDatabaseRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The database to update.
   * The `name` field of the database is of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/databases/&lt;database&gt;`.
   * </pre>
   *
   * <code>
   * .google.spanner.admin.database.v1.Database database = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the database field is set.
   */
  boolean hasDatabase();
  /**
   *
   *
   * <pre>
   * Required. The database to update.
   * The `name` field of the database is of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/databases/&lt;database&gt;`.
   * </pre>
   *
   * <code>
   * .google.spanner.admin.database.v1.Database database = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The database.
   */
  com.google.spanner.admin.database.v1.Database getDatabase();
  /**
   *
   *
   * <pre>
   * Required. The database to update.
   * The `name` field of the database is of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/databases/&lt;database&gt;`.
   * </pre>
   *
   * <code>
   * .google.spanner.admin.database.v1.Database database = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.spanner.admin.database.v1.DatabaseOrBuilder getDatabaseOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The list of fields to update. Currently, only
   * `enable_drop_protection` field can be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The list of fields to update. Currently, only
   * `enable_drop_protection` field can be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The list of fields to update. Currently, only
   * `enable_drop_protection` field can be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
