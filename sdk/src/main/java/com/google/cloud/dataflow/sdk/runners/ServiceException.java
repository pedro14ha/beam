/*
 * Copyright (C) 2015 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.cloud.dataflow.sdk.runners;

import javax.annotation.Nullable;

/**
 * Signals there was an error retrieving information about a job from the Cloud Dataflow Service.
 */
public class ServiceException extends AbstractJobException {
  private static final long serialVersionUID = 0L;

  ServiceException(DataflowPipelineJob job, String message) {
    this(job, message, null);
  }

  ServiceException(DataflowPipelineJob job, String message, @Nullable Throwable cause) {
    super(job, message, cause);
  }
}
