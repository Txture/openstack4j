package org.openstack4j.api.manila;

import org.openstack4j.common.RestService;
import org.openstack4j.model.compute.ActionResponse;
import org.openstack4j.model.manila.Share;
import org.openstack4j.model.manila.ShareCreate;
import org.openstack4j.model.manila.ShareUpdateOptions;
import org.openstack4j.model.manila.builder.ShareCreateBuilder;
import org.openstack4j.openstack.common.Metadata;

import java.util.List;

/**
 * Shares Service for Manila Shared File Systems.
 *
 * @author Daniel Gonzalez Nothnagel
 */
public interface SharesService extends RestService {
    /**
     * Creates a share.
     *
     * @param shareCreate the share to create
     * @return the created share
     */
    Share create(ShareCreate shareCreate);

    /**
     * Lists all shares.
     *
     * @return list of all shares
     */
    List<? extends Share> list();

    /**
     * Lists all shares, with details.
     *
     * @return list of all shares with details
     */
    List<? extends Share> listDetails();

    /**
     * Shows details for a share.
     *
     * @param shareId the share ID
     * @return the share or null if not found
     */
    Share get(String shareId);

    /**
     * Updates a share.
     *
     * @param shareId the share ID
     * @param shareUpdateOptions the options to update on the share
     * @return the updated share
     */
    Share update(String shareId, ShareUpdateOptions shareUpdateOptions);

    /**
     * Deletes a share.
     *
     * @param shareId the share ID
     * @return the action response
     */
    ActionResponse delete(String shareId);

    /**
     * Shows the metadata for a share.
     *
     * @param shareId the share ID
     * @return the shares metadata
     */
    Metadata getMetadata(String shareId);

    /**
     * Updates the metadata for a share.
     *
     * @param shareId the share ID
     * @param metadata the metadata to update
     * @return the updated metadata
     */
    Metadata updateMetadata(String shareId, Metadata metadata);

    /**
     * Sets the metadata on a share.
     *
     * @param shareId the share ID
     * @param metadata the metadata to set
     * @return the updated metadata
     */
    Metadata setMetadata(String shareId, Metadata metadata);

    /**
     * Unsets the metadata on a share.
     *
     * @param shareId the share ID
     * @param metadataKey the metadata key to unset
     * @return the action response
     */
    ActionResponse unsetMetadata(String shareId, String metadataKey);

    /**
     * @return a builder to create a share
     */
    ShareCreateBuilder shareCreateBuilder();
}
