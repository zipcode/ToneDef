/**
 * ****************************************************************************
 * ________                 ____       ____
 * _/_  __/___  ____  ___  / __ \___  / __/
 * __/ / / __ \/ __ \/ _ \/ / / / _ \/ /_
 * _/ / / /_/ / / / /  __/ /_/ /  __/ __/
 * /_/  \____/_/ /_/\___/_____/\___/_/
 *
 * Copyright (c) 2015 Bytes Templar
 * http://BytesTemplar.com/
 *
 * Refer to the license.txt file included for license information.
 * If it is missing, contact fortyseven@gmail.com for details.
 * ****************************************************************************
 */

package com.bytestemplar.tonedef.extras;

import android.os.Bundle;

import com.bytestemplar.tonedef.R;
import com.bytestemplar.tonedef.TonePanelActivity;
import com.bytestemplar.tonedef.tones.OtherTones;

/**
 * A junk drawer of assorted, uncategorized tones.
 */
public class OtherTonesActivity extends TonePanelActivity
{
    OtherTones other_tones;

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.other_tones );

        other_tones = new OtherTones( this );

        defineButton( R.id.btnJPDialtone, R.id.btnJPDialtoneAbout, other_tones._jp_dialtone );
        defineButton( R.id.btnJPRingback, R.id.btnJPRingbackAbout, other_tones._jp_ringback );
        defineButton( R.id.btnITDialtone, R.id.btnITDialtoneAbout, other_tones._it_ringback );
        defineButton( R.id.btnDEDialtone, R.id.btnDEDialtoneAbout, other_tones._de_dialtone );

        setTitleText( other_tones._title );

        setup();
    }
}