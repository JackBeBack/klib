package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.InboxMessageMail: ImageVector
    get() {
        if (_InboxMessageMail != null) {
            return _InboxMessageMail!!
        }
        _InboxMessageMail = ImageVector.Builder(
            name = "InboxMessageMail",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-24f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 15f)
                lineTo(3.924f, 3.917f)
                curveTo(3.967f, 3.399f, 4.4f, 3f, 4.92f, 3f)
                horizontalLineTo(19.08f)
                curveTo(19.6f, 3f, 20.033f, 3.399f, 20.076f, 3.917f)
                lineTo(21f, 15f)
                moveTo(3f, 15f)
                verticalLineTo(20f)
                curveTo(3f, 20.552f, 3.448f, 21f, 4f, 21f)
                horizontalLineTo(20f)
                curveTo(20.552f, 21f, 21f, 20.552f, 21f, 20f)
                verticalLineTo(15f)
                moveTo(3f, 15f)
                horizontalLineTo(9f)
                curveTo(9f, 16f, 9.6f, 18f, 12f, 18f)
                curveTo(14.4f, 18f, 15f, 16f, 15f, 15f)
                horizontalLineTo(21f)
            }
        }.build()

        return _InboxMessageMail!!
    }

@Suppress("ObjectPropertyName")
private var _InboxMessageMail: ImageVector? = null
