/*
 * Copyright 2019 Red Hat
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.apicurio.registry.kafka;

import io.apicurio.registry.common.proto.Cmmn;
import io.apicurio.registry.kafka.snapshot.StorageSnapshot;
import io.apicurio.registry.storage.proto.Str;
import org.apache.kafka.clients.consumer.ConsumerRecord;

/**
 * @author Ales Justin
 */
public interface KafkaRegistryStorageHandle {
    String registryTopic();
    String snapshotTopic();

    void loadSnapshot(StorageSnapshot snapshot);

    void consumeStorageValue(ConsumerRecord<Cmmn.UUID, Str.StorageValue> record);

    void start();

    void stop();
}
