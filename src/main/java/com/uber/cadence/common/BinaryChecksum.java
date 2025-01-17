/*
 *  Copyright 2012-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 *  Modifications copyright (C) 2017 Uber Technologies, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"). You may not
 *  use this file except in compliance with the License. A copy of the License is
 *  located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 *  or in the "license" file accompanying this file. This file is distributed on
 *  an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 *  express or implied. See the License for the specific language governing
 *  permissions and limitations under the License.
 */

package com.uber.cadence.common;

public final class BinaryChecksum {

  private static String binaryChecksum;

  private BinaryChecksum() {}

  public static String getBinaryChecksum() {
    // TODO: should set the binaryChecksum to some auto generated value if it's empty
    return binaryChecksum;
  }

  public static synchronized void setBinaryChecksum(String checksum) {
    if (binaryChecksum != null || checksum == null || checksum.isEmpty()) {
      return;
    }
    binaryChecksum = checksum;
  }
}
