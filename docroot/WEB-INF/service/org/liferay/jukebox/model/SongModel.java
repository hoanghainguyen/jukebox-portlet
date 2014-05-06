/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.liferay.jukebox.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.trash.TrashHandler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedGroupedModel;
import com.liferay.portal.model.TrashedModel;
import com.liferay.portal.model.WorkflowedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.trash.model.TrashEntry;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Song service. Represents a row in the &quot;jukebox_Song&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.liferay.jukebox.model.impl.SongModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.liferay.jukebox.model.impl.SongImpl}.
 * </p>
 *
 * @author Julio Camarero
 * @see Song
 * @see org.liferay.jukebox.model.impl.SongImpl
 * @see org.liferay.jukebox.model.impl.SongModelImpl
 * @generated
 */
public interface SongModel extends BaseModel<Song>, StagedGroupedModel,
	TrashedModel, WorkflowedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a song model instance should use the {@link Song} interface instead.
	 */

	/**
	 * Returns the primary key of this song.
	 *
	 * @return the primary key of this song
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this song.
	 *
	 * @param primaryKey the primary key of this song
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this song.
	 *
	 * @return the uuid of this song
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this song.
	 *
	 * @param uuid the uuid of this song
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the song ID of this song.
	 *
	 * @return the song ID of this song
	 */
	public long getSongId();

	/**
	 * Sets the song ID of this song.
	 *
	 * @param songId the song ID of this song
	 */
	public void setSongId(long songId);

	/**
	 * Returns the company ID of this song.
	 *
	 * @return the company ID of this song
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this song.
	 *
	 * @param companyId the company ID of this song
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this song.
	 *
	 * @return the group ID of this song
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this song.
	 *
	 * @param groupId the group ID of this song
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this song.
	 *
	 * @return the user ID of this song
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this song.
	 *
	 * @param userId the user ID of this song
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this song.
	 *
	 * @return the user uuid of this song
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this song.
	 *
	 * @param userUuid the user uuid of this song
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this song.
	 *
	 * @return the user name of this song
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this song.
	 *
	 * @param userName the user name of this song
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this song.
	 *
	 * @return the create date of this song
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this song.
	 *
	 * @param createDate the create date of this song
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this song.
	 *
	 * @return the modified date of this song
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this song.
	 *
	 * @param modifiedDate the modified date of this song
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the artist ID of this song.
	 *
	 * @return the artist ID of this song
	 */
	public long getArtistId();

	/**
	 * Sets the artist ID of this song.
	 *
	 * @param artistId the artist ID of this song
	 */
	public void setArtistId(long artistId);

	/**
	 * Returns the album ID of this song.
	 *
	 * @return the album ID of this song
	 */
	public long getAlbumId();

	/**
	 * Sets the album ID of this song.
	 *
	 * @param albumId the album ID of this song
	 */
	public void setAlbumId(long albumId);

	/**
	 * Returns the name of this song.
	 *
	 * @return the name of this song
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this song.
	 *
	 * @param name the name of this song
	 */
	public void setName(String name);

	/**
	 * Returns the status of this song.
	 *
	 * @return the status of this song
	 */
	@Override
	public int getStatus();

	/**
	 * Sets the status of this song.
	 *
	 * @param status the status of this song
	 */
	@Override
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this song.
	 *
	 * @return the status by user ID of this song
	 */
	@Override
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this song.
	 *
	 * @param statusByUserId the status by user ID of this song
	 */
	@Override
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this song.
	 *
	 * @return the status by user uuid of this song
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getStatusByUserUuid() throws SystemException;

	/**
	 * Sets the status by user uuid of this song.
	 *
	 * @param statusByUserUuid the status by user uuid of this song
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this song.
	 *
	 * @return the status by user name of this song
	 */
	@AutoEscape
	@Override
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this song.
	 *
	 * @param statusByUserName the status by user name of this song
	 */
	@Override
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this song.
	 *
	 * @return the status date of this song
	 */
	@Override
	public Date getStatusDate();

	/**
	 * Sets the status date of this song.
	 *
	 * @param statusDate the status date of this song
	 */
	@Override
	public void setStatusDate(Date statusDate);

	/**
	 * Returns the trash entry created when this song was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this song.
	 *
	 * @return the trash entry created when this song was moved to the Recycle Bin
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TrashEntry getTrashEntry() throws PortalException, SystemException;

	/**
	 * Returns the class primary key of the trash entry for this song.
	 *
	 * @return the class primary key of the trash entry for this song
	 */
	@Override
	public long getTrashEntryClassPK();

	/**
	 * Returns the trash handler for this song.
	 *
	 * @return the trash handler for this song
	 */
	@Override
	public TrashHandler getTrashHandler();

	/**
	 * Returns <code>true</code> if this song is in the Recycle Bin.
	 *
	 * @return <code>true</code> if this song is in the Recycle Bin; <code>false</code> otherwise
	 */
	@Override
	public boolean isInTrash();

	/**
	 * Returns <code>true</code> if the parent of this song is in the Recycle Bin.
	 *
	 * @return <code>true</code> if the parent of this song is in the Recycle Bin; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean isInTrashContainer();

	@Override
	public boolean isInTrashExplicitly() throws SystemException;

	@Override
	public boolean isInTrashImplicitly() throws SystemException;

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #isApproved()}
	 */
	@Deprecated
	@Override
	public boolean getApproved();

	/**
	 * Returns <code>true</code> if this song is approved.
	 *
	 * @return <code>true</code> if this song is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this song is denied.
	 *
	 * @return <code>true</code> if this song is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this song is a draft.
	 *
	 * @return <code>true</code> if this song is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this song is expired.
	 *
	 * @return <code>true</code> if this song is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this song is inactive.
	 *
	 * @return <code>true</code> if this song is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this song is incomplete.
	 *
	 * @return <code>true</code> if this song is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this song is pending.
	 *
	 * @return <code>true</code> if this song is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this song is scheduled.
	 *
	 * @return <code>true</code> if this song is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled();

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Song song);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Song> toCacheModel();

	@Override
	public Song toEscapedModel();

	@Override
	public Song toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}